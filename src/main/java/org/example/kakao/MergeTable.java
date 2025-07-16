package org.example.kakao;

import java.util.*;

public class MergeTable {
    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    class Cell {
        Point parent;
        String value = "";

        Cell(int x, int y) {
            parent = new Point(x, y);
        }
    }

    Cell[][] table = new Cell[51][51];

    public String[] solution(String[] commands) {
        List<String> result = new ArrayList<>();

        // 초기화
        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                table[i][j] = new Cell(i, j);
            }
        }

        for (String cmdLine : commands) {
            String[] cmd = cmdLine.split(" ");
            switch (cmd[0]) {
                case "UPDATE":
                    if (cmd.length == 4) {
                        int r = Integer.parseInt(cmd[1]);
                        int c = Integer.parseInt(cmd[2]);
                        String value = cmd[3];
                        Point root = find(table[r][c].parent);
                        table[root.x][root.y].value = value;
                    } else {
                        String val1 = cmd[1], val2 = cmd[2];
                        for (int i = 1; i <= 50; i++) {
                            for (int j = 1; j <= 50; j++) {
                                Point root = find(table[i][j].parent);
                                if (table[root.x][root.y].value.equals(val1)) {
                                    table[root.x][root.y].value = val2;
                                }
                            }
                        }
                    }
                    break;
                case "MERGE": {
                    int r1 = Integer.parseInt(cmd[1]);
                    int c1 = Integer.parseInt(cmd[2]);
                    int r2 = Integer.parseInt(cmd[3]);
                    int c2 = Integer.parseInt(cmd[4]);
                    Point p1 = find(table[r1][c1].parent);
                    Point p2 = find(table[r2][c2].parent);
                    if (!p1.equals(p2)) {
                        String v1 = table[p1.x][p1.y].value;
                        String v2 = table[p2.x][p2.y].value;
                        table[p2.x][p2.y].parent = p1;
                        if (!v1.equals("")) {
                            table[p1.x][p1.y].value = v1;
                        } else {
                            table[p1.x][p1.y].value = v2;
                        }
                    }
                    break;
                }
                case "UNMERGE": {
                    int r = Integer.parseInt(cmd[1]);
                    int c = Integer.parseInt(cmd[2]);
                    Point target = find(table[r][c].parent);
                    String savedValue = table[target.x][target.y].value;
                    List<Point> toUnmerge = new ArrayList<>();
                    for (int i = 1; i <= 50; i++) {
                        for (int j = 1; j <= 50; j++) {
                            if (find(table[i][j].parent).equals(target)) {
                                toUnmerge.add(new Point(i, j));
                            }
                        }
                    }
                    for (Point p : toUnmerge) {
                        table[p.x][p.y].parent = new Point(p.x, p.y);
                        table[p.x][p.y].value = "";
                    }
                    table[r][c].value = savedValue;
                    break;
                }
                case "PRINT": {
                    int r = Integer.parseInt(cmd[1]);
                    int c = Integer.parseInt(cmd[2]);
                    Point root = find(table[r][c].parent);
                    String value = table[root.x][root.y].value;
                    result.add(value.equals("") ? "EMPTY" : value);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }

    private Point find(Point p) {
        if (!table[p.x][p.y].parent.equals(p)) {
            table[p.x][p.y].parent = find(table[p.x][p.y].parent);
        }
        return table[p.x][p.y].parent;
    }
}


//당신은 표 편집 프로그램을 작성하고 있습니다.
//표의 크기는 50 × 50으로 고정되어있고 초기에 모든 셀은 비어 있습니다.
//각 셀은 문자열 값을 가질 수 있고, 다른 셀과 병합될 수 있습니다.
//
//        위에서 r번째, 왼쪽에서 c번째 위치를 (r, c)라고 표현할 때, 당신은 다음 명령어들에 대한 기능을 구현하려고 합니다.
//
//        "UPDATE r c value"
//        (r, c) 위치의 셀을 선택합니다.
//선택한 셀의 값을 value로 바꿉니다.
//"UPDATE value1 value2"
//value1을 값으로 가지고 있는 모든 셀을 선택합니다.
//선택한 셀의 값을 value2로 바꿉니다.
//"MERGE r1 c1 r2 c2"
//        (r1, c1) 위치의 셀과 (r2, c2) 위치의 셀을 선택하여 병합합니다.
//선택한 두 위치의 셀이 같은 셀일 경우 무시합니다.
//선택한 두 셀은 서로 인접하지 않을 수도 있습니다. 이 경우 (r1, c1) 위치의 셀과 (r2, c2) 위치의 셀만 영향을 받으며, 그 사이에 위치한 셀들은 영향을 받지 않습니다.
//두 셀 중 한 셀이 값을 가지고 있을 경우 병합된 셀은 그 값을 가지게 됩니다.
//두 셀 모두 값을 가지고 있을 경우 병합된 셀은 (r1, c1) 위치의 셀 값을 가지게 됩니다.
//이후 (r1, c1) 와 (r2, c2) 중 어느 위치를 선택하여도 병합된 셀로 접근합니다.
//"UNMERGE r c"
//        (r, c) 위치의 셀을 선택하여 해당 셀의 모든 병합을 해제합니다.
//선택한 셀이 포함하고 있던 모든 셀은 프로그램 실행 초기의 상태로 돌아갑니다.
//병합을 해제하기 전 셀이 값을 가지고 있었을 경우 (r, c) 위치의 셀이 그 값을 가지게 됩니다.
//        "PRINT r c"
//        (r, c) 위치의 셀을 선택하여 셀의 값을 출력합니다.
//선택한 셀이 비어있을 경우 "EMPTY"를 출력합니다.
//아래는 UPDATE 명령어를 실행하여 빈 셀에 값을 입력하는 예시입니다.
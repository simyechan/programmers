
public class programmers250137 {
    public static void main(String[] args) {

//        int[] bandage = {5, 1, 5};
//        int health = 30;
//        int[][] attacks  = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks  = {{1, 15}, {5, 16}, {8, 6}};
        int h = 0;
        int max_health = health;

        for (int t = 0, a = 0; t <= attacks[attacks.length-1][0]; t++) {

            if (a <= attacks.length && attacks[a][0] == t) {
                health -= attacks[a][1];
                a++;
                h = 0;
                System.out.println("attacks :" + health);
                if (health <= 0) System.out.println(-1);
            }
            else if(health != max_health) {
                if (health + bandage[1] >= max_health) {
                    health = max_health;
                    System.out.println("heal :" + health);
                    h++;
                } else {
                    health += bandage[1];
                    System.out.println("heal :" + health);
                    h++;
                }
                if (h == bandage[0]) {
                    if (health + bandage[2] >= max_health) {
                        health = max_health;
                        System.out.println("more heal :" + health);
                        h = 0;
                    } else {
                        health += bandage[2];
                        System.out.println("more heal :" + health);
                        h = 0;
                    }
                }
            }
        }
        System.out.println(health);
    }
}

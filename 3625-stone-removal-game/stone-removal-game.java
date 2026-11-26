
class Solution {
    public boolean canAliceWin(int n) {
        int a = n;
        boolean alice = true;

        for (int i = 10; i >= 1; i--) {
            if (a < i) {
                return !alice;
            }

            a = a - i;
            alice = !alice;
        }

        return !alice;
    }
}


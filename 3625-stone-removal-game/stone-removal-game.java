
class Solution {
    public boolean canAliceWin(int n) {
        int a = n;

        for (int i = 10; i >= 1; i = i - 2) {
            if (a >= i) {
                a = a - i;
            } 
            else {
                return false;
            }

            if (i == 2) {
                return true;
            }

            if (a < i - 1) {
                return true;
            }

            a = a - (i - 1);
        }

        return true;
    }
}


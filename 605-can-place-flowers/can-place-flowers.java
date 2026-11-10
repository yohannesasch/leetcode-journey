class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int counter = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean leftSpot = (i == 0 || flowerbed[i - 1] == 0);

                boolean rightSpot = (i == flowerbed.length - 1
                        || flowerbed[i + 1] == 0);

                if (leftSpot && rightSpot) {
                    flowerbed[i] = 1;
                    counter++;
                }

                if (counter >= n) {
                    return true;
                }
            }
        }

        return counter >= n;
    }
}
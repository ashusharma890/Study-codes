
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        //Write your code here
        // we are comparing squared values because sqrt leads to loss of
// precision sometimes.
        int distanceBetweenCentresSquared =
                (X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1);
        int sumOfRadiiSquared = (R2 + R1) * (R2 + R1);
        return (distanceBetweenCentresSquared <= sumOfRadiiSquared ? 1 : 0);
    }
}
 //end




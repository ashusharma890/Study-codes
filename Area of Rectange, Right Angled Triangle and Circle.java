class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int rec= L*W;
        double tri= 0.5 * B * H;
        double circ= 3.14*R*R;
        int[] area= new int[3];
        area[0]=rec;
        area[1]=(int)tri;
        area[2]=(int)circ;
        return area;
    }
};

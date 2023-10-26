public class CanPlaceFlowers {
    //You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    //
    //Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(n==0)
            return true;

        if(flowerbed.length==1){
            if(flowerbed[0] == 0){
                count++;
                if(count == n)
                    return true;
            } else{
                return false;
            }
        }
        if(flowerbed[0] == 0 && flowerbed[1] ==0){
            flowerbed[0] = 1;
            count++;
            if(count == n)
                return true;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                i+=1;
                count++;
                if(count == n)
                    return true;
            }
        }
        if(flowerbed[flowerbed.length-2] == 0 && flowerbed[flowerbed.length-1] ==0){
            flowerbed[flowerbed.length-1] = 1;
            count++;
            if(count == n)
                return true;
        }
        return count == n;
    }
}

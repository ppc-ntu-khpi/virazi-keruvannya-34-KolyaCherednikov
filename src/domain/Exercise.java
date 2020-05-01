package domain;

/**
 * Содержет реализацию метода который подсчитывает кол-во техники для списания
 * @author Коля
 */
public class Exercise {
    /** Подсчитывает кол-во техники для списания
     * @return result кол-во списаной техники*/
    public static int Calculate(){
        byte[] arr = new byte[6];
        int num;
        byte arrnum;
        int result = 0;
        for (int i = 1; i <= 100000; i++){
            
            for(arrnum = 0; arrnum < arr.length; arrnum++)
                arr[arrnum] = 0;
            
            num = i;
            arrnum = 5;
            do{
                arr[arrnum] = (byte) (num%10);
                arrnum -= 1;
                num/=10;
            }while(num>0);
            for(arrnum = 5; arrnum > 0; arrnum--){
                if(arr[arrnum] == 4){
                    result += 1;
                    break;
                }
                else if(arr[arrnum-1] == 1 && arr[arrnum] == 3){
                    result += 1;
                    break;
                }
            }
                
        }
        return result;
    }
}

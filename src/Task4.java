
public class Task4 {
    static int count;
    static int max_otr=-30;
    static int min_polozh=30;
    static int index_otr,index_polozh;
    static int mass[] = new int[20];


     static void forEach(){
         for(int i:mass){
             System.out.print(i+" ");
         }
    }

    public static void main(String[] args) {
        while(count<20){
            int k =((int)(Math.random()*21)-10);
            mass[count]=k;
            count++;
        }

       forEach();

        for(int i=0;i<mass.length;i++){
            if(mass[i]>0){
                if(min_polozh>mass[i]){
                min_polozh = mass[i];
                index_polozh=i;}
            }
            else if(mass[i]<0){
                if(max_otr<mass[i]){
                    max_otr = mass[i];
                    index_otr=i;}
            }
            else if(mass[i]==0){
                continue;
            }
        }
        System.out.println("Минимальный положительный:"+ mass[index_polozh]+" Максимальный отрицательный:"+ mass[index_otr]);

        int temp = mass[index_polozh];
        mass[index_polozh] = mass[index_otr];
        mass[index_otr] = temp;

        forEach();
    }

}

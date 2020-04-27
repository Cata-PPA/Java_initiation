public class PrimitiveSiMetode {
    public static void main(String[] args){
        int a=8;
        int b=24;
        if(a>b){
            System.out.println("max="+a);
        }
        else{
            System.out.println("max="+b);
        }

        //call the method, observe the different parameters, thus different result
        printMax(20,21);

        int result=findMax(5,12);
        System.out.println(result);


        printSignProduct(5,-5,-3);

        int resultt=getPowerNr(3,4);
        System.out.println(resultt);

        double res=getSumNr(5000);
        System.out.println(res);

        printMessages(50);

        printSir(13);


        int[] sir=new int[6];
        sir[0]=21;
        sir[1]=23;
        sir[2]=3;
        sir[3]=41;
        sir[4]=5;
        sir[5]=9;

        int i=0;
        while(i<sir.length){
            System.out.println(sir[i]);
            i++;
        }


        int suma=calcSumOfArray(sir);
        System.out.println(suma);

        boolean ressult=checkValues(sir,221);
        System.out.println(ressult);

        int pozitie=getPosition(sir, 90);
        System.out.println("Found on position "+pozitie);

        int maxim=getMax(sir);
        System.out.println("Maximul este "+maxim);

        int smaxim=getSecondMax(sir);
        System.out.println("Maximul secund este "+smaxim);

        int difference=getDiff(sir);
        System.out.println("Diferenta este "+difference);
    }

// ******************       METODE      ****************

    static void printMax(int a, int b){

        if(a>b){
            System.out.println("max="+a);
        }
        else{
            System.out.println("max="+b);
        }
    }

    static int findMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }


    //metoda care va afisa semnul unui produs, printSignProduct
    static void printSignProduct(int a, int b, int c){
        int product=a*b*c;
        if (product < 0) {
            System.out.println("-");
        }
        else {
            System.out.println("+");
        }
    }

    //metoda pentru ridicare la putere
    static int getPowerNr(int n1, int n2){
        int i=1;
        int result=1;
        while (i<=n2){
            result=result*n1;
            i++;
        }
        return result;
    }

    //metoda pentru calcul suma cu fractii
    static double getSumNr(int n){
        double i=1;
        double sum=0;
        while(i<=n){
            sum=sum + 1/i;
            i++;
        }
        return sum;
    }

    //metoda pentru afisare mesaje pentru divizibilitate

    static void printMessages(int n){
        int i=0;
        while (i<=n){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println("*");
            }
            i++;
        }
    }


    // fibonacci sequence
    static void printSir(int n){
        int nr1=0;
        int nr2=1;
        System.out.println(0);
        System.out.println(1);
        while(nr2<=n) {
            int sum = nr1 + nr2;
            nr1 = nr2;
            nr2 = sum;
            System.out.println(sum);

        }
    }

    //problema 1 array-uri
    static int calcSumOfArray(int[] sir){
        int sum=0;
        int i=0;
        while (i<sir.length){
            sum=sum+sir[i];
            i++;
        }
        return sum;
    }
    //problema 2 - check for value with boolean
    static boolean checkValues(int [] sir, int check){
        int i=0;
        while (i<sir.length){
            if(sir[i]==check){
                return true;
            }
            i++;
        }
        return false;
    }
    //problema 3 - metoda care afla pozitia unei valori din sir
    static int getPosition(int [] sir, int value){
        int i=0;
        while (i<sir.length){
            if(sir[i]==value){
                return i;
            }
            i++;
        }
        return -1;
    }
    //problema 4 - maximul dintr-un sir
    static int getMax(int [] sir){
        int i=0;
        int max=0;
        while (i<sir.length){
            if(sir[i]>=max){
                max=sir[i];
            }
            i++;
        }
        return max;
    }
    //problema 5 - a doua cea mai mare valoare dintr-un sir
    static int getSecondMax(int [] sir){
        int i=0;
        int i2=0;
        int max=0;
        int smax=0;

        while (i<sir.length){
            if(sir[i]>=max){
                max=sir[i];
            }
            i++;
        }
        while (i2<sir.length){
            if(sir[i2]>=smax && sir[i2]<max){
                smax=sir[i2];
            }
            i2++;
        }
        return smax;
    }

    //problema 8 - metoda care face diferenta intre max si min

    static int getDiff(int [] sir){
        int i=0;
        int i2=0;
        int max=0;
        int min=sir[0];
        int diff;
        while (i<sir.length){
            if(sir[i]>=max){
                max=sir[i];
            }
            i++;
        }
        while (i2<sir.length){
            if(sir[i2]<=min){
                min=sir[i2];
            }
            i2++;
        }
        System.out.println(max);
        System.out.println(min);
        diff=max-min;
        return diff;
    }















}

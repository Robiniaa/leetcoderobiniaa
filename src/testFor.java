/*
for循环
 */


public class testFor {
    public static void main(String[] args) {
/*
求1-10的整数和
 */
int sum = 0;
for(int i = 0; i <= 10; i++){
    sum += i;

    }
System.out.println("1-10整数和的值为" + sum);


 /*
 嵌套for循环
 特点：外层循环一次，内层循环要完成遍历。
  */
System.out.println("九九乘法表：");
for(int i=1;i<=9;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+"*"+i+"="+j*i+"\t");
        }
        System.out.println();
    }

    }
}

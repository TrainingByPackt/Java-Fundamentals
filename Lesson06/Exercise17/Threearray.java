public class Threearray
{
public static void main(String args[])
{
int arr[][][] = new int[2][2][2];
int i, j, k, num=1;
for(i=0; i<2; i++)
{
for(j=0; j<2; j++)
{
for(k=0; k<2; k++)
{
arr[i][j][k] = num;
num++;
}
}
}
for(i=0; i<2; i++)
{
for(j=0; j<2; j++)
{
for(k=0; k<2; k++)
{
System.out.print(arr[i][j][k]+ "\t");
}
System.out.println();
}
System.out.println();
}
}
}
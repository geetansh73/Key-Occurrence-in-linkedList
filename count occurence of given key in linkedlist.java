import java.util.Scanner;
public class linkedlist
{
Node head=null;
class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
void print()
{
Node d=head;
while(d!=null)
{
System.out.print(d.data+" ");
d=d.next;
}
}
void count(int key)
{
    int count=0;
    if (key<=0)
    {
    System.out.println("\n key must be larger than 0");
    }
Node g=head;
while(g!=null)
{
if (g.data==key)
{
count++;
}
g=g.next;
}
if (count>0)
{
System.out.println("\n "+key+" given key occurs in linkedlist "+count+" times");
}
else
{
System.out.println("\n No key found");
}
}
void push(int data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    int key=sc.nextInt();
linkedlist obj=new linkedlist();
obj.push(1);
obj.push(2);
obj.push(1);
obj.push(2);
obj.push(1);
obj.push(3);
obj.push(1);
obj.print();
obj.count(key);
}
}
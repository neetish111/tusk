import java.lang.*;
import  java.util.*;
class StudInfo
{
int rollno;
String stuname,stubr,stumail,phno;

void getStuInfo()
{
System.out.println("roll no:"+rollno);
System.out.println("stuname:"+stuname);
System.out.println("stubr:"+stubr);
System.out.println("stumail:"+stumail);
System.out.println("phno:"+phno);
}
}
class Mainclass{
public static void main(String args[])
{
StudInfo pr=new StudInfo();
pr.rollno=23;
pr.stuname="raj prakash";
pr.stubr="electronics engineering";
pr.stumail="rajbhargav@gmail.com";
pr.phno="9867453210";
pr.getStuInfo();
}
}

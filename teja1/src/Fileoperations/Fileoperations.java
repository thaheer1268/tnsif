import java.io.File;
import java.util.Scanner;
public class fileP {

 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the File Name:");
 String fname=s.next();
File f1=new File(fname);
System.out.println("File name:"+f1.getName());
f1.setWritable(false);
System.out.println(f1.exists()?"File exists":"file does not exist");
System.out.println(f1.canWrite()?"File is writable":"File is not writeable");
System.out.println(f1.canRead()?"File is readable":"File is not readable");
String fileName=f1.toString();
int index=fileName.lastIndexOf('.');
if(index>0)
{
 String type=fileName.substring(index+1);
 System.out.println("File type is"+type);
}
else
{
 System.out.println("File doesnt have type");
}
System.out.println("File size:"+f1.length()+"Bytes");
 }

}
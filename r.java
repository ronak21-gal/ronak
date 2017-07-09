import java.util.Scanner;

class r
{
public static void main(String[] args)
{
	
float a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,ab,bc,cd; 

Scanner sc=new Scanner(System.in);


System.out.print("Enter the marks obtained in Maths 4 out of 80");
System.out.println();
System.out.print("Enter the marks obtained in Maths 4 internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in Maths 4  in termwork out of 25");
System.out.println();
System.out.println();
System.out.print("Enter the marks obtained in CN out of 80");
System.out.println();
System.out.print("Enter the marks obtained in CN internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in CN  in termwork out of 25");
System.out.println();
System.out.print("Enter the marks obtained in CN  in Orals out of 25");
System.out.println();
System.out.println();
System.out.print("Enter the marks obtained in AT out of 80");
System.out.println();
System.out.print("Enter the marks obtained in AT internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in AT  in termwork out of 25");
System.out.println();
System.out.println();
System.out.print("Enter the marks obtained in COA out of 80");
System.out.println();
System.out.print("Enter the marks obtained in COA internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in COA  in termwork out of 25");
System.out.println();
System.out.print("Enter the marks obtained in COA  in Orals out of 25");
System.out.println();
System.out.println();
System.out.print("Enter the marks obtained in WP  out of 80");
System.out.println();
System.out.print("Enter the marks obtained in WP internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in WP  in termwork out of 25");
System.out.println();
System.out.print("Enter the marks obtained in WP  in Orals out of 25");
System.out.println();
System.out.println();
System.out.print("Enter the marks obtained in ITC out of 80");
System.out.println();
System.out.print("Enter the marks obtained in ITC internal out of 20");
System.out.println();
System.out.print("Enter the marks obtained in ITC  in termwork out of 25");
System.out.println();
System.out.println();

a=sc.nextInt();
i=sc.nextInt();
w=sc.nextInt();
System.out.println();
b=sc.nextInt();
j=sc.nextInt();
x=sc.nextInt();
ab=sc.nextInt();
System.out.println();
c=sc.nextInt();
k=sc.nextInt();
y=sc.nextInt();
System.out.println();
d=sc.nextInt();
l=sc.nextInt();
z=sc.nextInt();
bc=sc.nextInt();
System.out.println();
e=sc.nextInt();
m=sc.nextInt();
h=sc.nextInt();
cd=sc.nextInt();
System.out.println();
f=sc.nextInt();
n=sc.nextInt();
g=sc.nextInt();
System.out.println();

o=(a+i);
p=(b+j);
r=(c+k);
s=(d+l);
t=(e+m);
u=(f+n);
q=(o+p+r+s+t+u+w+x+y+z+h+g+ab+bc+cd);
v=q*100/825;

if(a>80 || b>80 || c>80 || d>80 || e>80 || f>80 || i>20 || j>20 || k>20 || l>20 || m>20 || n>20 || w>25 || x>25 || y>25 || z>25 || h>25 || g>25 || ab>25 || bc>25 || cd>25)
{
System.out.println("Invalid Inputs");
}else
if(o>=50 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}else
if(o>=50 && p>=50 && c>=32 && d>=32 && e>=32 && f>=32 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}else
if(o>=50 && p>=50 && r>=50 && d>=32 && e>=32 && f>=32 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}else
if(s>=50 && o>=50 && p>=50 && r>=50 && e>=32 && f>=32 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}else
if(t>=50 && s>=50 && o>=50 && p>=50 && r>=50 && f>=32 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}else
if(u>=50 && t>=50 && s>=50 && o>=50 && p>=50 && r>=50 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();
if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=24 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");	
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=24 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=24 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10 )
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");	
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=24 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");	
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=24 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10 )
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");	
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=24 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");	
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=6 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=6 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=6 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10 )
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=6 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=6 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else
if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=6 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");		
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");	
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else

if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=8 && bc>=10 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");	
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else

if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=8 && cd>=10)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");	
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else

if(a>=32 && b>=32 && c>=32 && d>=32 && e>=32 && f>=32 && i>=8 && j>=8 && k>=8 && l>=8 && m>=8 && n>=8 && w>=10 && x>=10 && y>=10 && z>=10 && h>=10 && g>=10 && ab>=10 && bc>=10 && cd>=8)
{
System.out.println("Result=Pass*");
System.out.println();
System.out.println("Total="+q);
System.out.println();
System.out.println("Percentage="+v);
System.out.println();

if(a<32 || b<32 || c<32 || d<32 || e<32 || f<32 || i<8 || j<8 || k<8 || l<8 || m<8 || n<8 || ab<10 || bc<10 || cd<10)
{
System.out.println("Passed with grace marks");
System.out.println();
System.out.println("Remark=Passed through grace");	
}
else
if(v>=80)
{
System.out.println("grade='O'");
System.out.println();
System.out.println("Remark=Outstanding");
}
else
if(v>=75)
{
System.out.println("grade='A'");
System.out.println();
System.out.println("Remark=First Class with Distinction");
}	
else
if(v>=60)
{
System.out.println("grade='B'");
System.out.println();
System.out.println("Remark=First Class");	
}
else
if(v>=50)
{
System.out.println("grade='C'");
System.out.println();
System.out.println("Remark=Second Class");	
}
else
if(v>=40)
{
System.out.println("grade='D'");
System.out.println();
System.out.println("Remark=Pass Class");	
}
}
else

if(w<10)
{
System.out.println("Maths-4 Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();
	
}
else
if(x<10)
{
System.out.println("CN Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();
	
}
else
if(y<10)
{
System.out.println("AT Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();

}
else
if(z<10)
{
System.out.println("COA Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();
	
}
else
if(h<10)
{
System.out.println("WP Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();
	
}
else
if(g<10)
{
System.out.println("ITC Term work not submitted Satisfactorily");
System.out.println();	
System.out.println("Result=Fail");
System.out.println();

}
else
{	
System.out.println("Result=Fail");
System.out.println();
System.out.println("Total="+q);	
System.out.println();
System.out.println("Percentage= -");
}

}
}
 

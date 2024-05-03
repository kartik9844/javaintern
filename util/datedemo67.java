//67. wp to display day of week in words

import java.util.*;
class datedemo67
{
public static void main(String arg[])
{
Date d1=new Date();
String day[]={"sun","mon","tue","wed","thu","fri","sat"};

System.out.println(day[d1.getDay()]);

}
}
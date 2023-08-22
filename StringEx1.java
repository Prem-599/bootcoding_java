public class StringEx1 {
    public static void main(String[] args) {



                //How to create String in Java
                String name = "SamSung"; // Samsung
                char[] chars = name.toCharArray();
                // [S,a,m,S,u,n,g]
                // [0,1,2,3,4,5,6]
                System.out.println(name.toUpperCase());
                System.out.println(name.toLowerCase());
                System.out.println(name.trim());
                System.out.println(name.charAt(0));
                System.out.println(name.indexOf("S"));
                System.out.println(name.lastIndexOf("S"));

                String s1 = "Ramesh";
                String s2 = "Ganesh";

                if(s1.equals(s2)){
                    System.out.println("Names are same!");
                }else{
                    System.out.println("Names are different!");

                }
                // equals() - compare 2 strings

                String technology = "Java,C,C++"; //break
                // Split
                String[] array = technology.split(",");
               System.out.println(technology);
                String date = "12/10/2023";
                String[] split1 = date.split("/");
                String text = "from the target VM";

                String[] textSplit = text.split(" ");
                String tech1 = "Java";
                String tech2 = "JAVA";
                // System.out.println("Java".equals(tech2));

                String ram = "drRamesh";
                // substring() - beginIndex and endIndex
                String substring = ram.substring(0, 2);
                String sub2 = ram.substring(2, 8);
                System.out.println(substring);
                // == -> Equality comparison
                // equals() -> Equality comparison
                // == - Compares References of 2 strings
                // equals() - compares values of 2 strings

                // split(",") - "HTML,CSS,MySQL,JAVA"
                //"HTML"
                //"CSS"
                //"MySQL"
                //"JAVA"

                // subString(beginIndex, lastIndex) - "SpringBoot"
                // subString(0,5) -> Spring

            }
        }



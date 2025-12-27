
public class StringBufferBuilderDemo {

    public static void main(String[] args) {

        String str = new String("royal");
        StringBuffer sb = new StringBuffer(str);

        System.out.println(str);
        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb);//layor 

        //StringBuffer -> String 
        String rev = sb.toString();

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        StringBuffer sb2 = new StringBuffer("royal");

        sb2.insert(2, "AHD");
        System.out.println(sb2);

        sb2.delete(2, 5);//2:inclusive,5:exclusive 
        System.out.println(sb2);

        sb2.append("Education");
        System.out.println(sb2);

        sb2.substring(3); //3rd - end 

    }
}

public class string {
    public static void main (String [] args){
        String s=new String("ana");
        String d=new String("ana");
        System.out.println(s==d);
        String name=new String("Java Is An Object Oriented Programming ");
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3,9));
        System.out.println(name.startsWith("j"));
        String var=("aurabh");
        switch(var){
            case "aman":
                System.out.println("you  will be astronomer");
                break;
            case "Saurabh":
                System.out.println("you are teacher");
                break;
            default:
                System.out.println("you will be doctor");
        }

        int[][] flats=new int[2][3];
        System.out.println(flats.length);
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][2]=202;
        flats[1][3]=203;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");}
            System.out.println(" ");}

    }
}

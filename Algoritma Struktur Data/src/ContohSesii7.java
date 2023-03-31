import java.util.Stack;

public class ContohSesii7{
    public static void main(String[] args) throws Exception{
        Stack<String> jurusan = new Stack<String>();
        jurusan.push("Teknik Informatika");
        jurusan.push("Teknik Industri");
        jurusan.push("Teknik Mesin");
        jurusan.push("DKV");

        System.out.println("Stack item \t\t : "+ jurusan);
        jurusan.pop();
        System.out.println("Stack after pop \t\t :" + jurusan);
        System.out.println("Pick \t\t\t :" + jurusan.peek());

        System.out.println("Check apakah koson? \t : "+jurusan.empty());
        System.out.println("Check apakah koson? \t : "+jurusan.isEmpty());

        System.out.println("Lihat index ke 2\t : "+jurusan.get(1));
        System.out.println("Lihat index Pertama\t : "+jurusan.firstElement());
        System.out.println("Lihat index Terakhir\t : "+jurusan.lastElement());
        jurusan.remove(1);
        System.out.println("Stack Item sebelum Clear \t : "+jurusan);
        jurusan.clear();
        System.out.println("Stack item setelah clear \t : "+jurusan);


        for (String j : jurusan){
            System.out.println("Stack Item \t : "+ j);
        }
    }
}
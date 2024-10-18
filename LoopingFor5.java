public class LoopingFor5 {
    public static void main(String[] args) {
    int  r = 0, s = 1, t = 0;
    while (r <= 610) {
        System.out.print(r+" ");
        r +=s;
        s = t;
        t = r;
      }
      System.out.println(" ");
}
}
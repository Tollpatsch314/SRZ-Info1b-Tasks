import java.util.Scanner;

public class Schaltplan {

  public static void main(String[] args) {

    boolean schalterA = false;
    boolean schalterB = false;
    boolean schalterC = false;

    S000();

    while (true) {
      // Scanner s = new Scanner(System.in);
      // System.out.println("A, B oder C eingeben: ");
      // char befehl = s.next().charAt(0);
      
      char befehl = InOut.readChar("A, B oder C eingeben: ");

      if (befehl == 'A') {
        if (schalterA == true) {
          schalterA = false;
        } else {
          schalterA = true;
        }
      }
      if (befehl == 'B') {
        if (schalterB == true) {
          schalterB = false;
        } else {
          schalterB = true;
        }
      }
      if (befehl == 'C') {
        if (schalterC == true) {
          schalterC = false;
        } else {
          schalterC = true;
        }

      }

      if (!schalterA && !schalterB && !schalterC)
        S000();

      if (schalterA && !schalterB && !schalterC)
        S001();

      if (!schalterA && schalterB && !schalterC)
        S010();

      if (schalterA && schalterB && !schalterC)
        S011();

      if (!schalterA && !schalterB && schalterC)
        S100();
      
      if (schalterA && !schalterB && schalterC)
        S101();

      if (!schalterA && schalterB && schalterC)
        S110();

      if (schalterA && schalterB && schalterC)
        S111();

    }

  }

  public static void S000() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                  │");
    System.out.println(" \\                  O");
    System.out.println("  \\ A               │");
    System.out.println(" o                  │");
    System.out.println(" │         / B      │");
    System.out.println(" │ ┌─────o/ o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │       / C    │  ");
    System.out.println("   └─────o/ o─────┘  ");
  }

  public static void S001() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                  │");
    System.out.println(" |                  O");
    System.out.println(" |A                 │");
    System.out.println(" o                  │");
    System.out.println(" │         / B      │");
    System.out.println(" │ ┌─────o/ o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │       / C    │  ");
    System.out.println("   └─────o/ o─────┘  ");
  }

  public static void S010() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                  │");
    System.out.println(" \\                  O");
    System.out.println("  \\A                │");
    System.out.println(" o                  │");
    System.out.println(" │          B       │");
    System.out.println(" │ ┌─────o──o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │       / C    │  ");
    System.out.println("   └─────o/ o─────┘  ");
  }

  public static void S011() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                 \\│/");
    System.out.println(" │                ─ O ─");
    System.out.println(" │  A              /│\\ ");
    System.out.println(" o                  │");
    System.out.println(" │          B       │");
    System.out.println(" │ ┌─────o──o─────┐ │");                   
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │       / C    │  ");
    System.out.println("   └─────o/ o─────┘  ");
  }

  public static void S100() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                  │");
    System.out.println(" \\                  O");
    System.out.println("  \\A                │");
    System.out.println(" o                  │");
    System.out.println(" │         / B      │");
    System.out.println(" │ ┌─────o/ o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │        C     │  ");
    System.out.println("   └─────o──o─────┘  ");
  }

  public static void S101() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                 \\│/");
    System.out.println(" │                ─ O ─");
    System.out.println(" │  A              /│\\ ");
    System.out.println(" o                  │");
    System.out.println(" │         / B      │");
    System.out.println(" │ ┌─────o/ o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │        C     │  ");
    System.out.println("   └─────o──o─────┘  ");

  }

  public static void S110() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                  │");
    System.out.println(" \\                  O");
    System.out.println("  \\A                │");
    System.out.println(" o                  │");
    System.out.println(" │          B       │");
    System.out.println(" │ ┌─────o──o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │        C     │  ");
    System.out.println("   └─────o──o─────┘  ");
  }

  public static void S111() {
    System.out.println(" ┌───────o  o───────┐");
    System.out.println(" │                  │");
    System.out.println(" o                 \\│/");
    System.out.println(" │                ─ O ─");
    System.out.println(" │  A              /│\\ ");
    System.out.println(" o                  │");
    System.out.println(" │          B       │");
    System.out.println(" │ ┌─────o──o─────┐ │");
    System.out.println(" │ │              │ │");
    System.out.println(" └─│              │─┘");
    System.out.println("   │        C     │  ");
    System.out.println("   └─────o──o─────┘  ");

  }

}

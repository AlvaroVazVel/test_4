import java.util.*;
import fun.Absyn.*;

public class Interpreter {

  final Strategy strategy;

  public Interpreter(Strategy strategy) {
    this.strategy = strategy;
  }

  public void interpret(Program p) {
    System.out.println("MAKE WORKS");
    throw new RuntimeException("Interpreter not implemented yet");
  }

}

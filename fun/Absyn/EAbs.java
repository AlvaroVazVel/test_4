package fun.Absyn; // Java Package generated by the BNF Converter.

public class EAbs extends Exp {
  public final String ident_;
  public final Exp exp_;
  public EAbs(String p1, Exp p2) { ident_ = p1; exp_ = p2; }

  public <R,A> R accept(fun.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof fun.Absyn.EAbs) {
      fun.Absyn.EAbs x = (fun.Absyn.EAbs)o;
      return this.ident_.equals(x.ident_) && this.exp_.equals(x.exp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.exp_.hashCode();
  }


}

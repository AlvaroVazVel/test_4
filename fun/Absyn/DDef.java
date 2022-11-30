package fun.Absyn; // Java Package generated by the BNF Converter.

public class DDef extends Def {
  public final String ident_;
  public final ListIdent listident_;
  public final Exp exp_;
  public DDef(String p1, ListIdent p2, Exp p3) { ident_ = p1; listident_ = p2; exp_ = p3; }

  public <R,A> R accept(fun.Absyn.Def.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof fun.Absyn.DDef) {
      fun.Absyn.DDef x = (fun.Absyn.DDef)o;
      return this.ident_.equals(x.ident_) && this.listident_.equals(x.listident_) && this.exp_.equals(x.exp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.ident_.hashCode())+this.listident_.hashCode())+this.exp_.hashCode();
  }


}

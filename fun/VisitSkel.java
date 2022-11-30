package fun;
import fun.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(fun.Absyn.Prog p, A arg)
    { /* Code For Prog Goes Here */
      for (Def x: p.listdef_)
      { /* ... */ }
      p.main_.accept(new MainVisitor<R,A>(), arg);
      return null;
    }
  }
  public class MainVisitor<R,A> implements Main.Visitor<R,A>
  {
    public R visit(fun.Absyn.DMain p, A arg)
    { /* Code For DMain Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }
  }
  public class DefVisitor<R,A> implements Def.Visitor<R,A>
  {
    public R visit(fun.Absyn.DDef p, A arg)
    { /* Code For DDef Goes Here */
      //p.ident_;
      for (String x: p.listident_)
      { /* ... */ }
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ExpVisitor<R,A> implements Exp.Visitor<R,A>
  {
    public R visit(fun.Absyn.EVar p, A arg)
    { /* Code For EVar Goes Here */
      //p.ident_;
      return null;
    }    public R visit(fun.Absyn.EInt p, A arg)
    { /* Code For EInt Goes Here */
      //p.integer_;
      return null;
    }        public R visit(fun.Absyn.EApp p, A arg)
    { /* Code For EApp Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(fun.Absyn.EAdd p, A arg)
    { /* Code For EAdd Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(fun.Absyn.ESub p, A arg)
    { /* Code For ESub Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(fun.Absyn.ELt p, A arg)
    { /* Code For ELt Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(fun.Absyn.EIf p, A arg)
    { /* Code For EIf Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      p.exp_3.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(fun.Absyn.EAbs p, A arg)
    { /* Code For EAbs Goes Here */
      //p.ident_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    
  }
}
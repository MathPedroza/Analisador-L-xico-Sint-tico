
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Jul 11 11:54:34 BRT 2021
//----------------------------------------------------

package AnalisadorSintatico;

import java.io.*;
import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Jul 11 11:54:34 BRT 2021
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner.
     * @param s */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner.
     * @param s
     * @param sf */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\003\004\000\002\003\003\000\002\014\004" +
    "\000\002\014\004\000\002\014\003\000\002\014\003\000" +
    "\002\014\003\000\002\014\003\000\002\014\003\000\002" +
    "\014\003\000\002\004\007\000\002\004\010\000\002\004" +
    "\010\000\002\004\005\000\002\004\003\000\002\023\003" +
    "\000\002\023\003\000\002\015\010\000\002\022\003\000" +
    "\002\020\003\000\002\024\003\000\002\024\003\000\002" +
    "\017\003\000\002\021\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\006\003\000\002\025\003" +
    "\000\002\007\007\000\002\010\006\000\002\012\010\000" +
    "\002\013\007\000\002\011\014\000\002\016\011" });

  /** Access to production table.
     * @return  */
  @Override
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\004\056\004\001\002\000\024\033\026\044" +
    "\016\047\015\052\011\053\027\055\007\057\024\076\032" +
    "\100\014\001\002\000\004\002\006\001\002\000\004\002" +
    "\001\001\002\000\004\056\122\001\002\000\024\033\026" +
    "\044\016\047\015\052\011\053\027\055\007\057\121\076" +
    "\032\100\014\001\002\000\004\035\107\001\002\000\024" +
    "\033\ufff9\044\ufff9\047\ufff9\052\ufff9\053\ufff9\055\ufff9\057" +
    "\ufff9\076\ufff9\100\ufff9\001\002\000\024\033\ufff8\044\ufff8" +
    "\047\ufff8\052\ufff8\053\ufff8\055\ufff8\057\ufff8\076\ufff8\100" +
    "\ufff8\001\002\000\020\005\uffef\006\uffef\013\uffef\034\uffef" +
    "\036\uffef\046\uffef\057\uffef\001\002\000\004\063\101\001" +
    "\002\000\006\013\uffee\070\074\001\002\000\024\033\ufff7" +
    "\044\ufff7\047\ufff7\052\ufff7\053\ufff7\055\ufff7\057\ufff7\076" +
    "\ufff7\100\ufff7\001\002\000\024\033\ufffd\044\ufffd\047\ufffd" +
    "\052\ufffd\053\ufffd\055\ufffd\057\ufffd\076\ufffd\100\ufffd\001" +
    "\002\000\024\033\ufffa\044\ufffa\047\ufffa\052\ufffa\053\ufffa" +
    "\055\ufffa\057\ufffa\076\ufffa\100\ufffa\001\002\000\004\013" +
    "\073\001\002\000\024\033\ufff5\044\ufff5\047\ufff5\052\ufff5" +
    "\053\ufff5\055\ufff5\057\ufff5\076\ufff5\100\ufff5\001\002\000" +
    "\006\002\uffff\077\070\001\002\000\004\013\067\001\002" +
    "\000\020\005\046\033\026\044\034\063\047\064\045\066" +
    "\051\100\014\001\002\000\004\035\040\001\002\000\024" +
    "\033\ufff6\044\ufff6\047\ufff6\052\ufff6\053\ufff6\055\ufff6\057" +
    "\ufff6\076\ufff6\100\ufff6\001\002\000\020\005\ufff0\006\ufff0" +
    "\013\ufff0\034\ufff0\036\ufff0\046\ufff0\057\ufff0\001\002\000" +
    "\004\035\033\001\002\000\010\033\026\044\034\100\014" +
    "\001\002\000\016\005\uffee\006\uffee\034\uffee\036\uffee\046" +
    "\uffee\057\uffee\001\002\000\004\036\036\001\002\000\004" +
    "\056\037\001\002\000\024\033\uffe1\044\uffe1\047\uffe1\052" +
    "\uffe1\053\uffe1\055\uffe1\057\uffe1\076\uffe1\100\uffe1\001\002" +
    "\000\010\033\026\044\034\100\014\001\002\000\004\036" +
    "\042\001\002\000\004\056\043\001\002\000\004\057\044" +
    "\001\002\000\024\033\uffdf\044\uffdf\047\uffdf\052\uffdf\053" +
    "\uffdf\055\uffdf\057\uffdf\076\uffdf\100\uffdf\001\002\000\010" +
    "\033\uffe5\044\uffe5\100\uffe5\001\002\000\010\033\uffe3\044" +
    "\uffe3\100\uffe3\001\002\000\010\033\uffe6\044\uffe6\100\uffe6" +
    "\001\002\000\010\005\057\006\056\034\060\001\002\000" +
    "\010\033\uffe4\044\uffe4\100\uffe4\001\002\000\010\033\026" +
    "\044\034\100\014\001\002\000\004\034\054\001\002\000" +
    "\004\013\055\001\002\000\020\005\ufff4\006\ufff4\013\ufff4" +
    "\034\ufff4\036\ufff4\046\ufff4\057\ufff4\001\002\000\010\033" +
    "\026\044\034\100\014\001\002\000\010\033\026\044\034" +
    "\100\014\001\002\000\020\005\ufff1\006\ufff1\013\ufff1\034" +
    "\ufff1\036\ufff1\046\ufff1\057\ufff1\001\002\000\004\034\062" +
    "\001\002\000\004\013\063\001\002\000\020\005\ufff3\006" +
    "\ufff3\013\ufff3\034\ufff3\036\ufff3\046\ufff3\057\ufff3\001\002" +
    "\000\004\034\065\001\002\000\004\013\066\001\002\000" +
    "\020\005\ufff2\006\ufff2\013\ufff2\034\ufff2\036\ufff2\046\ufff2" +
    "\057\ufff2\001\002\000\024\033\ufffb\044\ufffb\047\ufffb\052" +
    "\ufffb\053\ufffb\055\ufffb\057\ufffb\076\ufffb\100\ufffb\001\002" +
    "\000\004\056\071\001\002\000\004\057\072\001\002\000" +
    "\024\033\uffe0\044\uffe0\047\uffe0\052\uffe0\053\uffe0\055\uffe0" +
    "\057\uffe0\076\uffe0\100\uffe0\001\002\000\024\033\ufffc\044" +
    "\ufffc\047\ufffc\052\ufffc\053\ufffc\055\ufffc\057\ufffc\076\ufffc" +
    "\100\ufffc\001\002\000\004\010\075\001\002\000\004\046" +
    "\076\001\002\000\004\020\077\001\002\000\004\011\100" +
    "\001\002\000\004\013\uffed\001\002\000\004\004\102\001" +
    "\002\000\004\035\103\001\002\000\004\047\015\001\002" +
    "\000\004\036\105\001\002\000\004\065\106\001\002\000" +
    "\026\033\uffdc\036\uffdc\044\uffdc\047\uffdc\052\uffdc\053\uffdc" +
    "\055\uffdc\057\uffdc\076\uffdc\100\uffdc\001\002\000\010\033" +
    "\026\044\034\100\014\001\002\000\004\046\111\001\002" +
    "\000\010\033\026\044\034\100\014\001\002\000\004\046" +
    "\113\001\002\000\010\033\026\044\034\100\014\001\002" +
    "\000\004\036\115\001\002\000\004\056\116\001\002\000" +
    "\004\057\117\001\002\000\024\033\uffdd\044\uffdd\047\uffdd" +
    "\052\uffdd\053\uffdd\055\uffdd\057\uffdd\076\uffdd\100\uffdd\001" +
    "\002\000\024\033\ufffe\044\ufffe\047\ufffe\052\ufffe\053\ufffe" +
    "\055\ufffe\057\ufffe\076\ufffe\100\ufffe\001\002\000\006\002" +
    "\000\077\070\001\002\000\010\033\026\044\034\100\014" +
    "\001\002\000\004\057\124\001\002\000\004\055\125\001" +
    "\002\000\024\033\uffde\044\uffde\047\uffde\052\uffde\053\uffde" +
    "\055\uffde\057\uffde\076\uffde\100\uffde\001\002" });

  /** Access to parse-action table.
     * @return  */
  @Override
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\004\002\004\001\001\000\030\003\007\004" +
    "\021\007\020\010\011\011\027\012\012\013\016\014\017" +
    "\015\024\016\022\023\030\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\026\004\021\007\020" +
    "\010\011\011\027\012\012\013\016\014\117\015\024\016" +
    "\022\023\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\047\006\051\023\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\004\034\023\030\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\040\023\030\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\052\023" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\063\023\030\001\001\000\006\004" +
    "\060\023\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\016\103\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\107\023" +
    "\030\001\001\000\002\001\001\000\006\004\111\023\030" +
    "\001\001\000\002\001\001\000\006\004\113\023\030\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\122\023\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table.
     * @return  */
  @Override
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  @Override
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action.
     * @param act_num
     * @param parser
     * @param stack
     * @param top
     * @return 
     * @throws java.lang.Exception */
  @Override
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state.
     * @return  */
  @Override
  public int start_state() {return 0;}
  /** Indicates start production.
     * @return  */
  @Override
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  @Override
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index.
     * @return  */
  @Override
  public int error_sym() {return 1;}



        public static void main(String args[]) throws Exception {
            // new parser(new Yylex(new FileInputStream(args[0])).parse();
            new Parser(new Yylex(System.in)).parse();

        }

  @Override
        public void syntax_error(Symbol s) {
                report_error("Error de sintaxis. Linha: " +(s.right + 1) +
                "Coluna: " + s.left + ".Texto: \"" + s.value + "\"", null);
        // public static void carregar(String arquivo) Throws Exception {
        // new parser(new Yylex(new FileInputStream(arquivo))).parse();
        }

    private void report_error(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // FUNCAO ::= func atribuicao_func letra abre_parenteses FUNCAO fecha_parenteses inicio_funcao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FUNCAO",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // FOR ::= para abre_parenteses EXPR virgula EXPR virgula EXPR fecha_parenteses abre_chave fecha_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FOR",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // DOWHILE ::= enquanto_for abre_chave EXPR fecha_chave enquanto_for 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DOWHILE",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // WHILE ::= enquanto abre_parenteses EXPR fecha_parenteses abre_chave fecha_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("WHILE",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ELSE ::= fecha_chave senao abre_chave fecha_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ELSE",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // IF ::= se abre_parenteses EXPR fecha_parenteses abre_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("IF",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ATRIBRELACIONAL ::= relacional 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATRIBRELACIONAL",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ATRIB ::= relacional 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATRIB",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ATRIB ::= criacao_de_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATRIB",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ATRIB ::= atribuicao_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATRIB",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ATRIB ::= atribuicao_func 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATRIB",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // FORMAS ::= shape 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FORMAS",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CHAVES ::= opcoes_fk 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CHAVES",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RELACIONAMENTOS ::= relacionamentos_classes 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("RELACIONAMENTOS",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RELACIONAMENTOS ::= relacionamento 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("RELACIONAMENTOS",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // NAVEGACAO ::= navegabilidade 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NAVEGACAO",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // VISIBILIDADE ::= atributos_visibilidade 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VISIBILIDADE",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACAO ::= variavel tipo_atributo tipos virgula associacoes_atributos final_linha 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DECLARACAO",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // VALOR ::= variavel 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VALOR",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // VALOR ::= numero 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("VALOR",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPR ::= VALOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPR ::= abre_colchete EXPR fecha_colchete 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPR ::= abre_colchete EXPR oparitmetico EXPR fecha_colchete final_linha_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPR ::= abre_colchete EXPR relacional EXPR fecha_colchete final_linha_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXPR ::= abre_colchete ATRIB EXPR fecha_colchete final_linha_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CONTEUDO ::= FUNCAO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CONTEUDO ::= FOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CONTEUDO ::= DOWHILE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CONTEUDO ::= WHILE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CONTEUDO ::= ELSE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CONTEUDO ::= IF 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CONTEUDO ::= DECLARACAO final_linha_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CONTEUDO ::= EXPR final_linha_classe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CONTEUDO",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CORPO ::= CONTEUDO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CORPO",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CORPO ::= CORPO CONTEUDO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CORPO",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAMA ::= abre_chave fecha_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= abre_chave CORPO fecha_chave 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


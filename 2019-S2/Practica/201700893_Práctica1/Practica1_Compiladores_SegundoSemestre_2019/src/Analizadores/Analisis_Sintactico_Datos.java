
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import Estructuras.Cola;
import java.util.ArrayList;
import Modelos.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analisis_Sintactico_Datos extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos_Datos.class;
}

  /** Default constructor. */
  @Deprecated
  public Analisis_Sintactico_Datos() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analisis_Sintactico_Datos(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analisis_Sintactico_Datos(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\002\004\000\002\003\003\000\002\002" +
    "\005\000\002\002\004\000\002\021\005\000\002\021\004" +
    "\000\002\020\003\000\002\020\002\000\002\006\004\000" +
    "\002\006\003\000\002\022\003\000\002\022\003\000\002" +
    "\004\007\000\002\010\004\000\002\010\003\000\002\005" +
    "\006\000\002\005\004\000\002\005\003\000\002\007\003" +
    "\000\002\012\007\000\002\014\004\000\002\014\003\000" +
    "\002\011\004\000\002\011\003\000\002\013\004\000\002" +
    "\013\003\000\002\023\002\000\002\017\006\000\002\015" +
    "\005\000\002\015\003\000\002\016\003\000\002\016\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\070\000\010\013\007\016\011\017\010\001\002\000" +
    "\010\014\020\016\011\017\010\001\002\000\004\002\071" +
    "\001\002\000\024\002\ufff8\005\ufff8\006\ufff8\010\ufff8\013" +
    "\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\001\002\000\004" +
    "\011\053\001\002\000\024\002\ufff7\005\ufff7\006\ufff7\010" +
    "\ufff7\013\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\001\002" +
    "\000\024\002\ufff6\005\ufff6\006\ufff6\010\ufff6\013\ufff6\014" +
    "\ufff6\015\ufff6\016\ufff6\017\ufff6\001\002\000\004\002\000" +
    "\001\002\000\010\013\007\016\011\017\010\001\002\000" +
    "\010\014\020\016\011\017\010\001\002\000\024\002\ufff9" +
    "\005\ufff9\006\ufff9\010\ufff9\013\ufff9\014\ufff9\015\ufff9\016" +
    "\ufff9\017\ufff9\001\002\000\010\002\ufffa\016\011\017\010" +
    "\001\002\000\004\002\uffff\001\002\000\004\011\025\001" +
    "\002\000\010\014\020\016\011\017\010\001\002\000\010" +
    "\002\ufffa\016\011\017\010\001\002\000\004\002\ufffd\001" +
    "\002\000\010\002\ufffb\016\011\017\010\001\002\000\004" +
    "\004\026\001\002\000\010\006\027\016\011\017\010\001" +
    "\002\000\006\012\uffe7\015\uffe7\001\002\000\012\005\uffe8" +
    "\006\uffe8\016\uffe8\017\uffe8\001\002\000\012\005\040\006" +
    "\027\016\011\017\010\001\002\000\012\005\uffea\006\uffea" +
    "\016\uffea\017\uffea\001\002\000\010\006\027\016\011\017" +
    "\010\001\002\000\012\005\uffe9\006\uffe9\016\uffe9\017\uffe9" +
    "\001\002\000\010\002\uffee\016\uffee\017\uffee\001\002\000" +
    "\012\005\041\006\027\016\011\017\010\001\002\000\012" +
    "\005\uffeb\006\uffeb\016\uffeb\017\uffeb\001\002\000\010\002" +
    "\uffec\016\uffec\017\uffec\001\002\000\010\002\uffed\016\uffed" +
    "\017\uffed\001\002\000\006\012\043\015\044\001\002\000" +
    "\006\007\uffe2\010\uffe2\001\002\000\006\007\uffe3\010\uffe3" +
    "\001\002\000\006\007\047\010\050\001\002\000\006\007" +
    "\uffe4\010\uffe4\001\002\000\012\005\uffe6\006\uffe6\016\uffe6" +
    "\017\uffe6\001\002\000\006\012\043\015\044\001\002\000" +
    "\006\007\uffe5\010\uffe5\001\002\000\004\002\ufffc\001\002" +
    "\000\004\004\054\001\002\000\010\015\056\016\011\017" +
    "\010\001\002\000\012\005\064\010\ufffa\016\011\017\010" +
    "\001\002\000\012\005\uffef\010\uffef\016\uffef\017\uffef\001" +
    "\002\000\012\005\ufff0\010\ufff0\016\ufff0\017\ufff0\001\002" +
    "\000\010\015\056\016\011\017\010\001\002\000\012\005" +
    "\ufff1\010\ufff1\016\ufff1\017\ufff1\001\002\000\004\010\067" +
    "\001\002\000\010\014\ufff5\016\ufff5\017\ufff5\001\002\000" +
    "\010\014\ufff3\016\ufff3\017\ufff3\001\002\000\012\005\066" +
    "\010\ufffb\016\011\017\010\001\002\000\010\014\ufff4\016" +
    "\ufff4\017\ufff4\001\002\000\004\015\056\001\002\000\012" +
    "\005\ufff2\010\ufff2\016\ufff2\017\ufff2\001\002\000\004\002" +
    "\001\001\002\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\070\000\014\002\011\003\004\004\003\006\012\022" +
    "\005\001\001\000\012\006\020\012\015\021\071\022\005" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\013\022\014\001\001\000\012\006\020\012" +
    "\015\021\016\022\005\001\001\000\002\001\001\000\010" +
    "\006\023\020\051\022\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\012\021\022\014\001\001\000\010" +
    "\006\023\020\022\022\005\001\001\000\002\001\001\000" +
    "\004\022\014\001\001\000\002\001\001\000\014\006\032" +
    "\011\030\013\031\017\027\022\005\001\001\000\004\023" +
    "\041\001\001\000\002\001\001\000\014\006\035\013\036" +
    "\014\034\017\027\022\005\001\001\000\002\001\001\000" +
    "\006\017\033\022\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\017\033\022\014\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\015\044" +
    "\016\045\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\016\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\005\054\006\057\007\056\022\005" +
    "\001\001\000\012\006\064\010\062\020\061\022\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\007\060" +
    "\022\014\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\022\014\001\001" +
    "\000\002\001\001\000\004\007\067\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analisis_Sintactico_Datos$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analisis_Sintactico_Datos$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analisis_Sintactico_Datos$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Cola TodosLosErrores = new Cola();
    private Cola dato = new Cola();
    private Cola tipos = new Cola();
    private Cola registros = new Cola();
    private Cola cabecera = new Cola();
    private Boolean esPrimero = true;

    public Archivo archivo = new Archivo();

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        Errores error = new Errores(lexema,fila,columna,"Token " + lexema + " No esperado", "Sintactico");
        TodosLosErrores.insertar(error);
    }

    //Metodo al que se llama en el momento en el que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s){

    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analisis_Sintactico_Datos$actions {


    

  private final Analisis_Sintactico_Datos parser;

  /** Constructor */
  CUP$Analisis_Sintactico_Datos$actions(Analisis_Sintactico_Datos parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico_Datos$do_action_part00000000(
    int                        CUP$Analisis_Sintactico_Datos$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico_Datos$parser,
    java.util.Stack            CUP$Analisis_Sintactico_Datos$stack,
    int                        CUP$Analisis_Sintactico_Datos$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analisis_Sintactico_Datos$result;

      /* select the action based on the action number */
      switch (CUP$Analisis_Sintactico_Datos$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).value;
		RESULT = start_val;
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analisis_Sintactico_Datos$parser.done_parsing();
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= INICIO 
            {
              Object RESULT =null;
		

    ArrayList<Object> regis = registros.obtenerDatos();
    ArrayList<Object> cabe = cabecera.obtenerDatos();
    ArrayList<Object> tip = tipos.obtenerDatos();

    for(int i = 0; i < cabe.size(); i++){
        String nombre = cabe.get(i).toString().replace("\"", "");
        String tipo = tip.get(i).toString().replace("\"","");
        Cabecera cabecera = new Cabecera(nombre,tipo);
        archivo.getCabeceras().add(cabecera);
    }

    for (int i = 0; i < regis.size(); i++) {
        Cola cola = (Cola) regis.get(i);
        ArrayList<Object> regi = cola.obtenerDatos();
        Registro registro = new Registro();
        for (int j = 0; j < regi.size(); j++) {
            String dato = regi.get(j).toString().replace("\"","");
            registro.getRegistros().add(dato);
        }
        archivo.getRegistros().add(registro);
    }
    archivo.setErrores(TodosLosErrores);


              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("S",1, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= COM CLAVES RE 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-2)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= CLAVES RE 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // RE ::= COM REGISTROS FIN 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("RE",15, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-2)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // RE ::= REGISTROS FIN 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("RE",15, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FIN ::= COM 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("FIN",14, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FIN ::= 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("FIN",14, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // COM ::= COM COM2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("COM",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // COM ::= COM2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("COM",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // COM2 ::= comentarioMultiLinea 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("COM2",16, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // COM2 ::= comentarioLinea 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("COM2",16, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CLAVES ::= claves igual corcheteA L_CLAVES CLAVES3 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("CLAVES",2, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-4)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CLAVES3 ::= COM corcheteC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("CLAVES3",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // CLAVES3 ::= corcheteC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("CLAVES3",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // L_CLAVES ::= L_CLAVES FIN coma CLAVES2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_CLAVES",3, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // L_CLAVES ::= COM CLAVES2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_CLAVES",3, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // L_CLAVES ::= CLAVES2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_CLAVES",3, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CLAVES2 ::= cadena 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 cabecera.insertar(a); 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("CLAVES2",5, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // REGISTROS ::= registros igual corcheteA L_REGISTROS REGISTROS2 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTROS",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-4)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // REGISTROS2 ::= COM corcheteC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTROS2",10, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // REGISTROS2 ::= corcheteC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTROS2",10, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // L_REGISTROS ::= L_REGISTROS REGISTRO 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_REGISTROS",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // L_REGISTROS ::= REGISTRO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 if(a != null) esPrimero = false; 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_REGISTROS",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // REGISTRO ::= COM REGISTRO2 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 RESULT = a; 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTRO",9, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // REGISTRO ::= REGISTRO2 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 RESULT = a; 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTRO",9, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NT$0 ::= 
            {
              Object RESULT =null;
 dato = new Cola(); 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("NT$0",17, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // REGISTRO2 ::= llaveA NT$0 L_VALORES llaveC 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-1)).value;
		 
                                                                            if(cabecera.contador == dato.contador){
                                                                                if(esPrimero == false){
                                                                                    ArrayList<Object> array1 = dato.obtenerDatos();
                                                                                    ArrayList<Object> array2 = tipos.obtenerDatos();
                                                                                    int contadorErrores = 0;
                                                                                    for(int i = 0; i < array1.size(); i++){
                                                                                        if(array1.get(i).toString().startsWith("\"") && array2.get(i).equals("int")){
                                                                                            contadorErrores++;
                                                                                            Errores error = new Errores(array1.get(i).toString(),0,aright,"Se esperaba tipo Numerico, tipo Cadena encontrado","Semantico");
                                                                                            TodosLosErrores.insertar(error);
                                                                                        } else if(!array1.get(i).toString().startsWith("\"") && array2.get(i).equals("string")){
                                                                                            contadorErrores++;
                                                                                            Errores error = new Errores(array1.get(i).toString().replace("\"",""),0,aright,"Se esperaba tipo Cadena, tipo Numerico encontrado","Semantico");
                                                                                            TodosLosErrores.insertar(error);
                                                                                        }
                                                                                    }
                                                                                    if(contadorErrores == 0){
                                                                                        registros.insertar(dato);
                                                                                    }
                                                                                } else {
                                                                                    registros.insertar(dato);
                                                                                    RESULT = "ads";
                                                                                }
                                                                            } else {
                                                                                if(dato.contador != 0){
                                                                                    Errores error = new Errores(dato.cabeza.getContenido().toString().replace("\"",""),0,aright,"No coinciden las cantidades","Semantico");
                                                                                    TodosLosErrores.insertar(error);
                                                                                } else {
                                                                                    Errores error = new Errores("",0,aright,"No coinciden las cantidades","Semantico");
                                                                                    TodosLosErrores.insertar(error);
                                                                                }
                                                                                RESULT = null;
                                                                            }
                                                                        
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("REGISTRO2",13, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // L_VALORES ::= L_VALORES coma VALOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 
                                                                            if(esPrimero == true){
                                                                                if(a.toString().startsWith("\"")){
                                                                                    tipos.insertar("string");
                                                                                } else {
                                                                                    tipos.insertar("int");
                                                                                }
                                                                            }
                                                                            dato.insertar(a); 
                                                                        
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_VALORES",11, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.elementAt(CUP$Analisis_Sintactico_Datos$top-2)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // L_VALORES ::= VALOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 
                                                                            if(esPrimero == true){
                                                                                if(a.toString().startsWith("\"")){
                                                                                    tipos.insertar("string");
                                                                                } else {
                                                                                    tipos.insertar("int");
                                                                                }
                                                                            }
                                                                            dato.insertar(a); 
                                                                        
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("L_VALORES",11, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // VALOR ::= cadena 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 RESULT = a; 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("VALOR",12, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // VALOR ::= numero 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico_Datos$stack.peek()).value;
		 RESULT = a; 
              CUP$Analisis_Sintactico_Datos$result = parser.getSymbolFactory().newSymbol("VALOR",12, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico_Datos$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico_Datos$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analisis_Sintactico_Datos$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico_Datos$do_action(
    int                        CUP$Analisis_Sintactico_Datos$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico_Datos$parser,
    java.util.Stack            CUP$Analisis_Sintactico_Datos$stack,
    int                        CUP$Analisis_Sintactico_Datos$top)
    throws java.lang.Exception
    {
              return CUP$Analisis_Sintactico_Datos$do_action_part00000000(
                               CUP$Analisis_Sintactico_Datos$act_num,
                               CUP$Analisis_Sintactico_Datos$parser,
                               CUP$Analisis_Sintactico_Datos$stack,
                               CUP$Analisis_Sintactico_Datos$top);
    }
}

}

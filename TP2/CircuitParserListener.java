// Generated from CircuitParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CircuitParser}.
 */
public interface CircuitParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CircuitParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CircuitParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CircuitParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#circuit}.
	 * @param ctx the parse tree
	 */
	void enterCircuit(CircuitParser.CircuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#circuit}.
	 * @param ctx the parse tree
	 */
	void exitCircuit(CircuitParser.CircuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#liste_bool}.
	 * @param ctx the parse tree
	 */
	void enterListe_bool(CircuitParser.Liste_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#liste_bool}.
	 * @param ctx the parse tree
	 */
	void exitListe_bool(CircuitParser.Liste_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CircuitParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CircuitParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#liste_identifiant}.
	 * @param ctx the parse tree
	 */
	void enterListe_identifiant(CircuitParser.Liste_identifiantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#liste_identifiant}.
	 * @param ctx the parse tree
	 */
	void exitListe_identifiant(CircuitParser.Liste_identifiantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#equations}.
	 * @param ctx the parse tree
	 */
	void enterEquations(CircuitParser.EquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#equations}.
	 * @param ctx the parse tree
	 */
	void exitEquations(CircuitParser.EquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(CircuitParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(CircuitParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CircuitParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CircuitParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#commandes}.
	 * @param ctx the parse tree
	 */
	void enterCommandes(CircuitParser.CommandesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#commandes}.
	 * @param ctx the parse tree
	 */
	void exitCommandes(CircuitParser.CommandesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CircuitParser#commande}.
	 * @param ctx the parse tree
	 */
	void enterCommande(CircuitParser.CommandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CircuitParser#commande}.
	 * @param ctx the parse tree
	 */
	void exitCommande(CircuitParser.CommandeContext ctx);
}
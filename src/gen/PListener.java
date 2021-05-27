// Generated from C:/Users/hapsi/Projects/PParser/src\P.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(PParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(PParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(PParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(PParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(PParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(PParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(PParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(PParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PParser.ArgContext ctx);
}
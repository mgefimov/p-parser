// Generated from C:/Users/hapsi/Projects/PParser/src\P.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(PParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(PParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(PParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(PParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PParser.ArgContext ctx);
}
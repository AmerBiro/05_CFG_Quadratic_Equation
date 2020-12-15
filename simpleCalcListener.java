// Generated from simpleCalc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndenGradsLigning}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndenGradsLigning(simpleCalcParser.AndenGradsLigningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndenGradsLigning}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndenGradsLigning(simpleCalcParser.AndenGradsLigningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INPUT}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterINPUT(simpleCalcParser.INPUTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INPUT}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitINPUT(simpleCalcParser.INPUTContext ctx);
}
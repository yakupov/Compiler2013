// Generated from /home/ilia/Compiler2014/Cs.g4 by ANTLR 4.3
package org.itmo.iyakupov.a4autogen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull CsParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#assign_and_modify_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_and_modify_operator(@NotNull CsParser.Assign_and_modify_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(@NotNull CsParser.Assignment_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#parameter_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_type_list(@NotNull CsParser.Parameter_type_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(@NotNull CsParser.Equality_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull CsParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(@NotNull CsParser.Jump_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(@NotNull CsParser.Compound_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull CsParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#enum_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_specifier(@NotNull CsParser.Enum_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(@NotNull CsParser.Parameter_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(@NotNull CsParser.Declaration_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(@NotNull CsParser.Postfix_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull CsParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull CsParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#arg_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_suffix(@NotNull CsParser.Arg_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull CsParser.EnumeratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull CsParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#arr_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_suffix(@NotNull CsParser.Arr_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#arr_arg_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_arg_suffix(@NotNull CsParser.Arr_arg_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#cls_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_method(@NotNull CsParser.Cls_methodContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull CsParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull CsParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(@NotNull CsParser.Init_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(@NotNull CsParser.Selection_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(@NotNull CsParser.Expression_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(@NotNull CsParser.Init_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#cls_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_def(@NotNull CsParser.Cls_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(@NotNull CsParser.Identifier_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(@NotNull CsParser.Shift_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#comparsion_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparsion_operator(@NotNull CsParser.Comparsion_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull CsParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(@NotNull CsParser.Enumerator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CsParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(@NotNull CsParser.Logical_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull CsParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull CsParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(@NotNull CsParser.Conditional_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull CsParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull CsParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull CsParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(@NotNull CsParser.Iteration_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(@NotNull CsParser.Logical_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(@NotNull CsParser.Type_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator_suffix(@NotNull CsParser.Declarator_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(@NotNull CsParser.Parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(@NotNull CsParser.Argument_expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CsParser#constructor_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_call(@NotNull CsParser.Constructor_callContext ctx);
}
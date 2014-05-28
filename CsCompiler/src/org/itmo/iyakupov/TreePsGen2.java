package org.itmo.iyakupov;

import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import java.util.List;

import org.abego.treelayout.Configuration;
import org.abego.treelayout.NodeExtentProvider;
import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.TreeLayout;
import org.abego.treelayout.util.DefaultConfiguration;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.gui.PostScriptDocument;
import org.antlr.v4.runtime.tree.gui.TreeLayoutAdaptor;
import org.antlr.v4.runtime.tree.gui.TreeTextProvider;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class TreePsGen2
{
	public class VariableExtentProvide
	implements NodeExtentProvider<Tree>
	{
		public VariableExtentProvide() {}

		public double getWidth(Tree tree)
		{
			String s = TreePsGen2.this.getText(tree);
			return TreePsGen2.this.doc.getWidth(s) + TreePsGen2.this.nodeWidthPadding * 2;
		}

		public double getHeight(Tree tree)
		{
			String s = TreePsGen2.this.getText(tree);
			double h = TreePsGen2.this.doc.getLineHeight() + TreePsGen2.this.nodeHeightPaddingAbove + TreePsGen2.this.nodeHeightPaddingBelow;

			String[] lines = s.split("\n");
			return h * lines.length;
		}
	}

	protected double gapBetweenLevels = 5.0D;
	protected double gapBetweenNodes = 5.0D;
	protected int nodeWidthPadding = 1;
	protected int nodeHeightPaddingAbove = 0;
	protected int nodeHeightPaddingBelow = 5;

	protected Tree root;
	protected TreeTextProvider treeTextProvider;
	protected TreeLayout<Tree> treeLayout;
	protected PostScriptDocument doc;

	public TreePsGen2(@Nullable List<String> ruleNames, Tree root)
	{
		this(ruleNames, root, "Courier New", 11);
	}


	public TreePsGen2(@Nullable List<String> ruleNames, Tree root, String fontName, int fontSize)
	{
		this.root = root;
		setTreeTextProvider(new TreeViewer.DefaultTreeTextProvider(ruleNames));
		this.doc = new PostScriptDocument(fontName, fontSize);
		boolean compareNodeIdentities = true;
		this.treeLayout = new TreeLayout(
				new TreeLayoutAdaptor(root), 
				new VariableExtentProvide(), 
				new DefaultConfiguration(this.gapBetweenLevels, this.gapBetweenNodes, Configuration.Location.Bottom), 
				compareNodeIdentities);
	}

	public String getPS()
	{
		generateEdges((Tree)getTree().getRoot());
		for (Tree node : this.treeLayout.getNodeBounds().keySet()) {
			generateNode(node);
		}

		Dimension size = this.treeLayout.getBounds().getBounds().getSize();
		this.doc.boundingBox(size.width, size.height);
		this.doc.close();
		return this.doc.getPS(); }

	protected void generateEdges(Tree parent) { double x1;
	double y1;
	if (!getTree().isLeaf(parent)) {
		Rectangle2D.Double parentBounds = getBoundsOfNode(parent);

		x1 = parentBounds.getCenterX();
		y1 = parentBounds.y;
		for (Tree child : getChildren(parent)) {
			Rectangle2D.Double childBounds = getBoundsOfNode(child);

			double x2 = childBounds.getCenterX();
			double y2 = childBounds.getMaxY();
			this.doc.line(x1, y1, x2, y2);
			generateEdges(child);
		}
	}
	}

	protected void generateNode(Tree t)
	{
		String[] lines = getText(t).split("\n");
		Rectangle2D.Double box = getBoundsOfNode(t);



		if ((t instanceof ErrorNode)) {
			this.doc.highlight(box.x, box.y, box.width, box.height);
		}
		double x = box.x + this.nodeWidthPadding;
		double y = box.y + this.nodeHeightPaddingBelow;
		for (int i = 0; i < lines.length; i++) {
			this.doc.text(lines[i], x, y);
			y += this.doc.getLineHeight();
		}
	}

	protected TreeForTreeLayout<Tree> getTree() {
		return this.treeLayout.getTree();
	}

	protected Iterable<Tree> getChildren(Tree parent) {
		return getTree().getChildren(parent);
	}

	protected Rectangle2D.Double getBoundsOfNode(Tree node) {
		return (Rectangle2D.Double)this.treeLayout.getNodeBounds().get(node);
	}

	protected String getText(Tree tree) {
		String s = this.treeTextProvider.getText(tree);
		s = Utils.escapeWhitespace(s, false);
		return s;
	}

	public TreeTextProvider getTreeTextProvider() {
		return this.treeTextProvider;
	}

	public void setTreeTextProvider(TreeTextProvider treeTextProvider) {
		this.treeTextProvider = treeTextProvider;
	}
}

/* Location:           D:\downloads\antlr-runtime-4.2.2.jar
 * Qualified Name:     org.antlr.v4.runtime.tree.gui.TreePsGen2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.0.1
 */
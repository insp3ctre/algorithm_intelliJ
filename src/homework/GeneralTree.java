package homework;

import java.util.ArrayList;

public class GeneralTree<Object> {

    class Node {
        ArrayList<Node> childs;
        Object value;

        public Node(Object value) {
            this.value = value;
            this.childs = new ArrayList();
        }

        public Node() {
            this.value = null;
            this.childs = new ArrayList();
        }
    }

    private Node root;

    public GeneralTree() {
        this.root = new Node();
    }

    @Override
    public String toString() {
        if (root.value == null) {
            return "()";
        } else {
            String tree = "";
            tree = toString(root);
            return "(" + tree;
        }
    }
    
    public String toString(Node n) {
        String s = "";
        s += n.value;
        for (int i = 0; i < n.childs.size(); i++) {
            s += " (";
            s += toString(n.childs.get(i));
        }
        s += ")";
        return s;
    }

    public void setRoot(Object rute) {
        root.value = rute;
    }

    public void addChild(Node parent, Node child, Object childParent) {
        if (parent.value == childParent) {
            parent.childs.add(child);
        } else {
            for (int i = 0; i < parent.childs.size(); i++) {
                Node newNode = parent.childs.get(i);
                addChild(newNode, child, childParent);
            }
        }
    }

    public void addChild(Object parent, Object child) {
        Node chill = new Node(child);
        addChild(root, chill, parent);
    }
}
package access.modifiers;

import test.prot.modifier.TestProtModifier;

public class TestPublicModifier {
    private static int nr;
    public static void main(String[] args){
        System.out.println(nr);
        System.out.println(TestPrivateModifier.nr2);
        System.out.println(TestProtModifier.nr3);
    }
}


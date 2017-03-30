/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nn0;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import javax.lang.model.*;
        
/**
 *
 * @author root
 */
public class node implements Comparable<node>{
    public node() {
        
    }
    
    public int compareTo(node n) {
        //conditional comparisons!!
        return 0;
    }
    
    public void code() {
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        for(final SourceVersion version: compiler.getSourceVersions()) {
            System.out.println(version);
        }
    }
}

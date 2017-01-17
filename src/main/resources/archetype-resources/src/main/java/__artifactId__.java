#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Spring hello world!
 *
 */
public class ${artifactId}
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();
    }
}

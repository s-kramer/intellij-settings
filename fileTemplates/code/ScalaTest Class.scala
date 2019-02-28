#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end
#parse("File Header.java")
import org.scalatest.{FlatSpec, Matchers}

class ${NAME} extends FlatSpec with Matchers {

}

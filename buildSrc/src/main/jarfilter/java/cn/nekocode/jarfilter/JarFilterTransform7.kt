package cn.nekocode.jarfilter

import com.android.build.api.instrumentation.AsmClassVisitorFactory
import com.android.build.api.instrumentation.ClassContext
import com.android.build.api.instrumentation.ClassData
import com.android.build.api.instrumentation.InstrumentationParameters
import com.android.build.gradle.internal.dependency.CustomClassVisitor
import org.objectweb.asm.ClassVisitor

abstract class JarFilterTransform7 : AsmClassVisitorFactory<InstrumentationParameters.None> {

    override fun createClassVisitor(
        classContext: ClassContext,
        nextClassVisitor: ClassVisitor
    ): ClassVisitor {
        return CustomClassVisitor()//just test
    }

    override fun isInstrumentable(classData: ClassData): Boolean {
        return false
    }
}
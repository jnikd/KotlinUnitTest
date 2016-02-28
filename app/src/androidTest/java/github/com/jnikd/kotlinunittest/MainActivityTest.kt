package github.com.jnikd.kotlinunittest

import android.support.test.runner.AndroidJUnit4
import android.test.AndroidTestCase
import junit.framework.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest : AndroidTestCase() {

    override fun setUp() {
        super.setUp()
    }

    override fun tearDown() {
        super.tearDown()
    }

    @Test
    fun hoge() {
        Assert.assertEquals("hoge", "hoge")
    }
}
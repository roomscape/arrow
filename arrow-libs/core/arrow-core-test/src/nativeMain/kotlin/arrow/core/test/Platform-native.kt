package arrow.core.test

import arrow.core.test.concurrency.deprecateArrowTestModules

@Deprecated(deprecateArrowTestModules)
public actual fun isJvm(): Boolean = false
@Deprecated(deprecateArrowTestModules)
public actual fun isJs(): Boolean = false
@Deprecated(deprecateArrowTestModules)
public actual fun isNative(): Boolean = true
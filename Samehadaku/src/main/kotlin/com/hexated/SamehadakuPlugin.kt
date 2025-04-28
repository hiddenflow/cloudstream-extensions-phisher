
package com.hexated

import com.lagradost.cloudstream3.extractors.Acefile
import com.lagradost.cloudstream3.extractors.Gofile
import com.lagradost.cloudstream3.extractors.Krakenfiles
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class SamehadakuPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(Samehadaku())
        registerExtractorAPI(Acefile())
        registerExtractorAPI(Gofile())
        registerExtractorAPI(Krakenfiles())
    }
}

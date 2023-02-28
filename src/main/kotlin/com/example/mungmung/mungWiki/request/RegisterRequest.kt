package com.example.mungmung.mungWiki.request

import com.example.mungmung.mungWiki.entity.DogStatus
import com.example.mungmung.mungWiki.entity.DogType
import com.example.mungmung.mungWiki.entity.MungWiki
import com.example.mungmung.mungWiki.entity.WikiDocument
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.ToString

@Getter
@ToString
@RequiredArgsConstructor
class RegisterRequest {
    var dogType: DogType? = null

    var dogImgName: String? = null

    var wikiDocument: WikiDocument? = null

    var dogStatus: DogStatus? = null

    var intelligenceLevel : Long? = null

    var sheddingLevel : Long? = null

    var sociabilityLevel : Long? = null

    var activityLevel : Long? = null

    var indoorAdaptLevel : Long? = null

    var totalStatus : Long? = null

    var documentation : String? = null

    fun toMungWiki(): MungWiki? {
        return MungWiki(
            this.dogType,
            this.dogImgName,
            this.wikiDocument,
            this.dogStatus,
        )
    }

    fun toDogStatue() : DogStatus?{
        return DogStatus(
            this.intelligenceLevel,
            this.sheddingLevel,
            this.sociabilityLevel,
            this.activityLevel,
            this.indoorAdaptLevel,
        )
    }

    fun toWikiDocument() : WikiDocument?{
        return WikiDocument(
            this.totalStatus,
            this.documentation
        )
    }
}
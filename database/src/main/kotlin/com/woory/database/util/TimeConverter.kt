package com.woory.database.util

import org.threeten.bp.Instant
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.ZoneId
import org.threeten.bp.ZoneOffset
import java.util.Locale

object TimeConverter {

    val zoneId: ZoneId = ZoneId.of("Asia/Seoul")
    val zoneOffset: ZoneOffset = ZoneOffset.of("+09:00")

    val locale: Locale = Locale.KOREA

    fun OffsetDateTime.asMillis() = toInstant().toEpochMilli()

    fun Long.asOffsetDateTime(): OffsetDateTime =
        OffsetDateTime.ofInstant(Instant.ofEpochMilli(this), zoneId)

}
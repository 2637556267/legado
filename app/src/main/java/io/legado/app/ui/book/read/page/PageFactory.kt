package io.legado.app.ui.book.read.page

abstract class PageFactory<DATA>(protected val dataSource: DataSource) {

    abstract fun moveToFirst()

    abstract fun moveToLast()

    abstract fun moveToNext():Boolean

    abstract fun moveToPrev(): Boolean

    abstract val nextPage: DATA

    abstract val prevPage: DATA

    abstract val currentPage: DATA

    abstract val nextPagePlus: DATA

    abstract fun hasNext(): Boolean

    abstract fun hasPrev(): Boolean

}
package mergesort {


  object Sort {

    def MergeSort[T](list:List[T], sort:(T, T)=>Boolean):List[T] = {

      val mid = list.length / 2

      if (mid == 0)
        list
      else {
        def merge(listA: List[T], listB: List[T], sort:(T, T)=>Boolean): List[T] = 
          (listA, listB) match {
            case(Nil,listB) => listB
            case(listA, Nil) => listA
            case(x :: listA1, y :: listB1) =>
              if (sort(x, y)) 
                x::merge(listA1, listB, sort)
              else
                y::merge(listA, listB1, sort)

          }
          val (left, right) = list splitAt(mid)
          merge(MergeSort(left, sort), MergeSort(right, sort), sort)
        

      }
      
    }

  }

}

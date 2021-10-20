# Array vs. Linked List

---

## 1. Array와 Linked List

### 선형 자료구조

- 자료를 구성하는 데이터를 순차적으로 나열시킨 형태의 자료구조
- 인접한 데이터 간의 관계가 1:1인 자료구조
- ex) **Array, Linked List**, Stack, Queue, Dequeue(Double-ended Queue)

### Array

- 동일한 타입의 데이터들을 연속적인 메모리 공간에 저장하는 선형 자료구조
- 데이터의 논리적 위치와 물리적 위치가 같음
- 정해진 크기의 메모리 공간을 미리 할당 받아 사용

### Linked List

- 데이터와 링크(link)로 이루어진 노드(node)들을 메모리 공간에 저장하는 선형 자료구조
- Array와 달리 데이터들을 연속적인 메모리 공간에 저장하지 않아, 노드는 데이터 뿐만 아니라, 인접한 다음 노드를 참조할 수 있는 링크로 이루어짐
- 데이터의 논리적 위치와 물리적 위치가 다를 수 있음
- 자료가 추가될 때마다 메모리를 할당 받음(미리 자료구조의 크기를 정하지 않음)

---

## 2. Array vs. Linked List

### 크기

- Array (fixed size)
    
    미리 정해진 크기의 연속된 메모리 공간에 데이터를 저장하기 때문에, runtime 도중에 크기 변경 불가능
    
- Linked List (dynamic size)
    
    연속적이지 않은 메모리 공간에 데이터들이 흩어져 있기 때문에, runtime 도중에 메모리를 새롭게 할당하여 동적으로 크기 변경 가능
    

### 메모리 할당 시점

- Array는 compile time 중 Stack 영역에 할당이 되고, Linked List는 runtime중 Heap 영역에 동적으로 할당됨
- 하지만, 동적으로 할당 되는 Array 또한 runtime 도중 메모리에 할당됨

### 메모리 효율성

- 데이터 개수가 같을 경우, Linked List는 데이터 이외에도 링크를 포함하기 때문에, 더 많은 메모리 공간을 사용함
- Array는 연속적인 메모리 공간을 사용하기 때문에, 캐시의 지역성 측면에서 Linked List 보다 효율적이다.
    
    ⇒ 캐시(cache)는 지역성의 원리(Principle of locality)에 따라 '지역성'을 가진 데이터를 판단하고 저장한다. 지역성의 원리 중, 공간 지역성(Spatial locality)은 '최근 접근한 데이터에 다시 접근하는 경향'이다. 
    
- 하지만, Linked List의 크기가 동적이라는 특징이 , Array 보다 적은 메모리 공간을 사용하는 경우가 존재
    
    ⇒ fixed size를 가지는 Array는 미리 할당된 메모리 공간 중, 사용되지 않는 부분이 존재할 수 있음. 반면에, Linked List에서 사용되지 않는 메모리 공간은 존재하지 않음
    

### 실행 시간

- 접근 및 수정
    - Array의 경우, 데이터가 연속적인 메모리 공간에 저장되기 때문에 base adress(기준 주소, Array의 경우에 첫 번째 요소가 위치한 주소)를 안다면, 특정 데이터에 대한 접근을 쉽게 할 수 있음
        
        ⇒ index로 접근 가능
        
        ⇒ 시간 복잡도 : O(1)
        
    - Linked List의 경우, 연속적인 메모리 공간을 사용하지 않고, 링크를 통해 인접한 노드를 참조하기 때문에, 특정 노드를 만날 때 까지 순회를 해야만 접근할 수 있음.
        
        ⇒ 시간 복잡도 : O(n)
        
    - 수정 또한, 접근 후에 데이터 값을 변경하는 것 이기 때문에 접근의 경우와 동일
- 삽입 및 삭제
    - Array의 경우, 특정 위치에 데이터를 삽입 및 삭제를 하기 위해서, 인접한 데이터들을 전체적으로 shift 해야함
        
        ⇒ 시간 복잡도 : O(n)
        
    - Linked List의 경우, 특정 위치를 찾고(접근하고) 삽입 및 삭제를 하기 때문에 경우에 따라 실행 시간이 다르다.
        
        ⇒ 첫 번째 위치에 삽입 및 삭제하는 경우 - 시간 복잡도 : O(1)
        
        ⇒ 그 이외의 경우 - 시간 복잡도 : O(n)
        
        ⇒ 전체적으로, Linked List의 삽입 및 삭제 연산이 Array 보다 더 빠르다. 
        

---

## 3. 결론

앞서 알아본 두 자료구조의 차이를 통해, 상황에 따라 더 적절한 자료구조를 선택할 수 있다. 아래는 각 자료구조의 이점 활용할 수 있는 상황이다.  

- Array
    
    ⇒ 임의의 위치의 자료에 대한 접근(random access)이 빈번할 때
    
    ⇒ 할당해야 하는 메모리 공간의 크기를 미리 알고 있을 때
    
    ⇒ 한정된 컴퓨팅 자원을 가진 환경일 때 (ex>한정된 메모리)
    
- Linked List
    
    ⇒ 자료에 대한 삽입과 삭제가 빈번할 때
    
    ⇒ 자료구조에 대한 동적인 크기가 필요할 때
    

---

## Reference

[[Data Structure] Array vs LinkedList](https://woovictory.github.io/2018/12/27/DataStructure-Diff-of-Array-LinkedList/)

[Linked List vs Array - GeeksforGeeks](https://www.geeksforgeeks.org/linked-list-vs-array/)

[DS | Array vs linked list - javatpoint](https://www.javatpoint.com/ds-array-vs-linked-list)

[💵 캐시가 동작하는 아주 구체적인 원리: 하드웨어로 구현한 해시 테이블](https://parksb.github.io/article/29.html)
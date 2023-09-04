# PageReplacementAlgorithms
Third project for operating systems.

Badanie algorytmów zastępowania stron.

I. Wygenerować losowy ciąg n odwołań do stron  

II. Dla wygenerowanego ciągu podać liczbę braków strony dla różnych algorytmów zastępowania stron:
1. FIFO (usuwamy stronę najdłużej przebywającą w pamięci fizycznej)
2. OPT (optymalny - usuwamy stronę, która nie będzie najdłużej używana)
3. LRU (usuwamy stronę, do której najdłużej nie nastąpiło odwołanie)
4. aproksymowany LRU (Last Recently Used)
5. RAND (usuwamy losowo wybraną stronę)
   
Wskazówki:  
• Symulacje przeprowadzić (koniecznie na tym samym ciągu testowym) dla różnej liczby ramek, np. kilku (3, 5, 10?)
wartości podanych przez użytkownika. Wymagana możliwość sterowania parametrami symulacji.  
• Należy samodzielnie sformułować założenia symulacji: rozmiar pamięci wirtualnej (ilość stron), rozmiar pamięci fizycznej
(ilość ramek), długość (powinna być znaczna - min. 1000) i sposób generowania ciągu odwołań do stron (koniecznie
uwzględnić zasadę lokalności odwołań). 

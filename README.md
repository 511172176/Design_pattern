# 軟體測試與驗證 - 期末報告說明

## 專案Github
[王國保衛戰遊戲設計模式](https://github.com/511172176/Design_pattern)

## 遊戲情境故事
在遠古的一個王國中，人類、精靈、矮人和獸人為了爭奪資源和土地長期交戰。玩家可以選擇其中一個族群來建立和發展自己的城堡，並抵抗其他族群的侵略。遊戲名為「王國保衛戰」，是一款策略防禦類遊戲，玩家需要建造、指揮和管理自己的城堡以對抗不斷來襲的敵人。

### 設計模式應用
1. **Facade模式**
   - 為了讓玩家更容易管理複雜的資源和建築系統，遊戲提供了一個「建築管理介面」，這是一個Facade類，封裝了所有與建築、升級和維修有關的操作。玩家透過這個簡化的介面可以輕鬆訪問底層複雜的系統，例如資源收集、建築排程和防禦升級。

2. **Command模式**
   - 在遊戲中，玩家需要指揮軍隊來防禦城堡或攻擊敵人。使用Command模式，遊戲設計了一組命令類，如「攻擊」、「撤退」和「防禦」。玩家的每一個行動都將封裝成一個命令對象，這允許遊戲實現諸如撤銷操作和重播行動的功能，增加玩家對戰略決策的控制。

3. **Prototype模式**
   - 由於遊戲中有許多種類的單位和建築，並且它們往往需要快速生成，遊戲使用Prototype模式來管理這些實體的創建。每種單位和建築都有一個原型，並且可以快速複製出新的實例。這不僅提高了遊戲的性能，還確保了遊戲在大規模戰鬥時的流暢性。

## 遊戲流程
玩家從選擇一個族群開始，建立自己的城堡，隨著遊戲進程，玩家需要策略性地選擇升級路徑，不斷強化自己的城堡和軍隊。玩家將面臨來自其他族群的定期攻擊波，必須利用其戰術和資源優勢來生存和擴展領土。

這個情境結合了三種設計模式，使得遊戲不僅提供了豐富的互動性和策略深度，同時也保證了良好的用戶體驗和系統的可擴展性。這種設計讓玩家可以輕鬆入門，同時為進階玩家提供深度的策略選擇。

## 類別圖
![upup](https://github.com/511172176/kingdom_defense/assets/151836005/ac9d24b2-fbea-4f81-877a-2fd8806256b2)

## 循序圖
![dptt](https://github.com/511172176/Design_pattern/assets/151836005/90f303d6-61ec-4412-be1a-5aa13bd9b517)

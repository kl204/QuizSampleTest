package bitedu.bipa.member.service;

import java.util.ArrayList;
import java.util.List;
import bitedu.bipa.member.service.QuizService;
import bitedu.bipa.member.vo.BookCopy;


public class PaginationAlgorithm {
    private List<BookCopy> itemList;
    private int itemsPerPage;

    public PaginationAlgorithm(List<BookCopy> itemList, int itemsPerPage) {
        this.itemList = itemList;
        this.itemsPerPage = itemsPerPage;
    }

    public List<BookCopy> getItemsForPage(int pageNumber) {
        int startIndex = (pageNumber - 1) * itemsPerPage;
        int endIndex = Math.min(startIndex + itemsPerPage, itemList.size());

        if (startIndex >= endIndex) {
            return new ArrayList<>();
        }

        return itemList.subList(startIndex, endIndex);
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) itemList.size() / itemsPerPage);
    }
}

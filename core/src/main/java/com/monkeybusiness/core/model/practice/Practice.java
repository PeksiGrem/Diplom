package com.monkeybusiness.core.model.practice;

import java.util.Objects;

public class Practice {
  private Long id;
  private String practiceDateStart;
  private String practiceDateEnd;
  private String location;
  private PracticeStatus status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPracticeDateStart() {
    return practiceDateStart;
  }

  public void setPracticeDateStart(String practiceDateStart) {
    this.practiceDateStart = practiceDateStart;
  }

  public String getPracticeDateEnd() {
    return practiceDateEnd;
  }

  public void setPracticeDateEnd(String practiceDateEnd) {
    this.practiceDateEnd = practiceDateEnd;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PracticeStatus getStatus() {
    return status;
  }

  public void setStatus(PracticeStatus status) {
    this.status = status;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Practice practice = (Practice) o;
    return Objects.equals(id, practice.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
